/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Actor;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:08:26.906146+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "actors", description = "Este endpoint maneja la información de los actores, permitiendo la gestión de su perfil, incluyendo nombre, fecha de nacimiento, y fotografías.")
public interface ActorsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /actors/{actorID} : Elimina un actor
     * Elimina un actor de la base de datos. El ID del actor debe proporcionarse en la URL para identificar al actor que será eliminado.
     *
     * @param actorID El ID del actor a eliminar (required)
     * @return Actor eliminado con éxito (status code 204)
     *         or (NotFound) El recurso solicitado no existe en la base de datos. (status code 404)
     *         or (BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud. (status code 400)
     */
    @Operation(
        operationId = "actorsActorIDDelete",
        summary = "Elimina un actor",
        description = "Elimina un actor de la base de datos. El ID del actor debe proporcionarse en la URL para identificar al actor que será eliminado.",
        tags = { "actors" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Actor eliminado con éxito"),
            @ApiResponse(responseCode = "404", description = "(NotFound) El recurso solicitado no existe en la base de datos."),
            @ApiResponse(responseCode = "400", description = "(BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/actors/{actorID}"
    )
    
    default ResponseEntity<Void> actorsActorIDDelete(
        @Parameter(name = "actorID", description = "El ID del actor a eliminar", required = true, in = ParameterIn.PATH) @PathVariable("actorID") Integer actorID
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /actors/{actorID} : Devuelve los detalles de un actor específico
     * Devuelve los detalles de un actor específico a partir de su ID, como su nombre, fecha de nacimiento y las imágenes asociadas.
     *
     * @param actorID El ID del actor a obtener (required)
     * @return Actor obtenido con éxito (status code 200)
     *         or (NotFound) El recurso solicitado no existe en la base de datos. (status code 404)
     */
    @Operation(
        operationId = "actorsActorIDGet",
        summary = "Devuelve los detalles de un actor específico",
        description = "Devuelve los detalles de un actor específico a partir de su ID, como su nombre, fecha de nacimiento y las imágenes asociadas.",
        tags = { "actors" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Actor obtenido con éxito", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Actor.class))
            }),
            @ApiResponse(responseCode = "404", description = "(NotFound) El recurso solicitado no existe en la base de datos.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/actors/{actorID}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Actor> actorsActorIDGet(
        @Parameter(name = "actorID", description = "El ID del actor a obtener", required = true, in = ParameterIn.PATH) @PathVariable("actorID") Integer actorID
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoURL\" : \"photoURL\", \"actorID\" : 1, \"birthdayDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"Actor Name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /actors/{actorID} : Actualiza un actor
     * Actualiza los detalles de un actor existente. Este endpoint permite modificar la información de un actor, incluyendo su nombre o fecha de nacimiento.
     *
     * @param actorID El ID del actor a actualizar (required)
     * @param actor Objeto actor con nuevos valores (required)
     * @return Actor actualizado con éxito (status code 200)
     *         or (NotFound) El recurso solicitado no existe en la base de datos. (status code 404)
     *         or (BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud. (status code 400)
     */
    @Operation(
        operationId = "actorsActorIDPut",
        summary = "Actualiza un actor",
        description = "Actualiza los detalles de un actor existente. Este endpoint permite modificar la información de un actor, incluyendo su nombre o fecha de nacimiento.",
        tags = { "actors" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Actor actualizado con éxito", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Actor.class))
            }),
            @ApiResponse(responseCode = "404", description = "(NotFound) El recurso solicitado no existe en la base de datos."),
            @ApiResponse(responseCode = "400", description = "(BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/actors/{actorID}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Actor> actorsActorIDPut(
        @Parameter(name = "actorID", description = "El ID del actor a actualizar", required = true, in = ParameterIn.PATH) @PathVariable("actorID") Integer actorID,
        @Parameter(name = "Actor", description = "Objeto actor con nuevos valores", required = true) @Valid @RequestBody Actor actor
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoURL\" : \"photoURL\", \"actorID\" : 1, \"birthdayDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"Actor Name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /actors : Devuelve una lista de actores
     * Devuelve una lista completa de actores registrados en la base de datos con detalles como su nombre, fecha de nacimiento, y fotografías asociadas. Es útil para gestionar los perfiles de actores en la plataforma.
     *
     * @return Lista de actores obtenida con éxito (status code 200)
     */
    @Operation(
        operationId = "actorsGet",
        summary = "Devuelve una lista de actores",
        description = "Devuelve una lista completa de actores registrados en la base de datos con detalles como su nombre, fecha de nacimiento, y fotografías asociadas. Es útil para gestionar los perfiles de actores en la plataforma.",
        tags = { "actors" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de actores obtenida con éxito", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Actor.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/actors",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Actor>> actorsGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoURL\" : \"photoURL\", \"actorID\" : 1, \"birthdayDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"Actor Name\" }, { \"photoURL\" : \"photoURL\", \"actorID\" : 1, \"birthdayDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"Actor Name\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /actors : Inserta un nuevo actor
     * Permite agregar un nuevo actor a la base de datos, proporcionando su nombre y fecha de nacimiento como información obligatoria. Este endpoint es utilizado principalmente por los administradores.
     *
     * @param actor Objeto actor que será añadido (required)
     * @return Actor añadido con éxito (status code 201)
     *         or (BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud. (status code 400)
     */
    @Operation(
        operationId = "actorsPost",
        summary = "Inserta un nuevo actor",
        description = "Permite agregar un nuevo actor a la base de datos, proporcionando su nombre y fecha de nacimiento como información obligatoria. Este endpoint es utilizado principalmente por los administradores.",
        tags = { "actors" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Actor añadido con éxito", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Actor.class))
            }),
            @ApiResponse(responseCode = "400", description = "(BadRequest) Los datos enviados no son correctos o faltan datos obligatorios en la solicitud.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/actors",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Actor> actorsPost(
        @Parameter(name = "Actor", description = "Objeto actor que será añadido", required = true) @Valid @RequestBody Actor actor
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoURL\" : \"photoURL\", \"actorID\" : 1, \"birthdayDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"Actor Name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}