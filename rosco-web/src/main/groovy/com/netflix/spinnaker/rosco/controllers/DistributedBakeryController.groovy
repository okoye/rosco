/**
 * Copyright 2016 Cloudera, Inc.
 */

package com.netflix.spinnaker.rosco.controllers

import com.netflix.spinnaker.rosco.api.Bake
import com.netflix.spinnaker.rosco.api.BakeRequest
import com.netflix.spinnaker.rosco.api.BakeStatus
import com.netflix.spinnaker.rosco.distributed.api.RoscoSlaveService
import groovy.util.logging.Slf4j
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@Slf4j
class DistributedBakeryController extends BakeryController{

    @Autowired RoscoSlaveService roscoSlaveService


    @Override
    @RequestMapping(value = "/api/v1/{region}/bake", method = RequestMethod.POST)
    BakeStatus createBake(@PathVariable("region") String region,
                          @RequestBody BakeRequest bakeRequest,
                          @RequestParam(value = "rebake", defaultValue = "0") String rebake){

        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

    @Override
    @RequestMapping(value = "/api/v1/{region}/status/{statusId}", method = RequestMethod.GET)
    BakeStatus lookupStatus(@PathVariable("region") String region, @PathVariable("statusId") String statusId) {
        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

    @Override
    @ApiOperation(value = "Look up a bake")
    @RequestMapping(value = "/api/v1/{region}/bake/{bakeId}", method = RequestMethod.GET)
    Bake lookupBake(@ApiParam(value = "The region of the bake to lookup", required = true) @PathVariable("region") String region,
                    @ApiParam(value = "The id of the bake to lookup", required = true) @PathVariable("bakeId") String bakeId) {
        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

    @Override
    @RequestMapping(value = "/api/v1/{region}/logs/{statusId}", method = RequestMethod.GET)
    String lookupLogs(@PathVariable("region") String region,
                      @PathVariable("statusId") String statusId,
                      @RequestParam(value = "html", defaultValue = "false") Boolean html) {
        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

    @Override
    @RequestMapping(value = "/api/v1/{region}/bake", method = RequestMethod.DELETE)
    String deleteBake(@PathVariable("region") String region, @RequestBody BakeRequest bakeRequest) {
        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

    @Override
    @RequestMapping(value = "/api/v1/{region}/cancel/{statusId}", method = RequestMethod.GET)
    String cancelBake(@PathVariable("region") String region, @PathVariable("statusId") String statusId) {
        // FIXME: Implement this by dispatching requests to rosco slave services.
    }

}
