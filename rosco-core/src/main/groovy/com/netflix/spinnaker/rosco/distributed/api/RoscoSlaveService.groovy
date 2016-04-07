/**
 * Copyright 2016 Cloudera, Inc.
 */

package com.netflix.spinnaker.rosco.distributed.api

import com.netflix.spinnaker.rosco.api.Bake
import com.netflix.spinnaker.rosco.api.BakeRequest
import com.netflix.spinnaker.rosco.api.BakeStatus
import retrofit.http.Body
import retrofit.http.GET
import retrofit.http.POST
import retrofit.http.Path
import retrofit.http.Query
import rx.Observable

/**
 * An interface to Rosco Slave Service
 */

interface RoscoSlaveService {

    @POST("/api/v1/{region}/bake")
    Observable<BakeStatus> createBake(@Path("region") String region, @Body BakeRequest bake, @Query("rebake") String rebake)

    @GET("/api/v1/{region}/status/{statusId}")
    Observable<BakeStatus> lookupStatus(@Path("region") String region, @Path("statusId") String statusId)

    @GET("/api/v1/{region}/bake/{bakeId}")
    Observable<Bake> getBaseImage(@Path("region") String region, @Path("bakeId") String bakeId)
}