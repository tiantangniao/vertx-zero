package io.vertx.tp.plugin.qiy.remote;

import feign.Param;
import feign.RequestLine;
import io.vertx.core.json.JsonObject;

public interface QiyUploadApi {

    @RequestLine("GET /openupload?filetype={file_type}&filesize={file_size}&access_token={token}")
    JsonObject requestUpload(
            @Param("file_type") String fileType,
            @Param("file_size") String fileSize,
            @Param("token") String token);
}
