/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.swagger.sample.resource;

import io.swagger.annotations.*;
import io.swagger.sample.data.SatelliteData;
import io.swagger.sample.model.Satellite;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import java.util.List;

@Path("/satellite")
@Api(tags = {"satellite"})
@Produces({"application/json", "application/xml"})
public class SatelliteResource {
  static SatelliteData satData = new SatelliteData();

  @GET
  @Path("/{satId}")
  @ApiOperation(value = "Find satellite by ID ", 
    notes = "Returns a satellite, will return error condition if satellite does not exist",
    response = Satellite.class)
  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
      @ApiResponse(code = 404, message = "Sat not found") })
  public Response getPetById(
      @ApiParam(value = "ID of sat that needs to be fetched", 
              allowableValues = "range[1,100]", 
              required = true)
      @PathParam("satId") Long satId) throws io.swagger.sample.exception.NotFoundException {
    Satellite sat = satData.getSatelliteById(satId);
    if (null != sat) {
      return Response.ok().entity(sat).build();
    } else {
      throw new io.swagger.sample.exception.NotFoundException(404, "Satellite not found");
    }
  }

  @POST
  @ApiOperation(value = "Add a new Satellite to the store")
  @ApiResponses(value = { @ApiResponse(code = 405, message = "Invalid input") })
  public Response addPet(
      @ApiParam(value = "Sat object that needs to be added to the store", required = true) Satellite pet) {
    satData.addSatellite(pet);
    return Response.ok().entity("SUCCESS").build();
  }

  @PUT
  @ApiOperation(value = "Update an existing satellite")
  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
      @ApiResponse(code = 404, message = "Satellite not found"),
      @ApiResponse(code = 405, message = "Validation exception") })
  public Response updatePet(
      @ApiParam(value = "Sat object that needs to be added to the store", required = true) Satellite pet) {
    satData.addSatellite(pet);
    return Response.ok().entity("SUCCESS").build();
  }

  @GET
  @Path("/getAll")
  @ApiOperation(value = "Finds all satellites ", 
    notes = "criteria may be added to later versions", 
    response = Satellite.class, 
    responseContainer = "List")
  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid status value") })
  public Response findSatellites(
      //@ApiParam(value = "Status values that need to be considered for filter", required = true, defaultValue = "available", allowableValues = "available,pending,sold", allowMultiple = true) @QueryParam("status") String status,
      @BeanParam QueryResultBean qr
){
    return Response.ok(new GenericEntity<List<Satellite>>(satData.findSatellites()){}).build();
  }

//  @GET
//  @Path("/findByTags")
//  @ApiOperation(value = "Finds Pets by tags",
//    notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", 
//    response = Satellite.class, 
//    responseContainer = "List")
//  @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid tag value") })
//  @Deprecated
//  public Response findPetsByTags(
//      @ApiParam(value = "Tags to filter by", required = true, allowMultiple = true) @QueryParam("tags") String tags) {
//    return Response.ok(new GenericEntity<List<Satellite>>(petData.findPetByTags(tags)){}).build();
//  }
}
