package cnn.zglong.curl.json;

import lombok.Data;

/**
 * @author zglong
 * @version 1.0
 * @className CurlBase
 * @description
 * @date 2021/12/6 8:51
 */
@Data

public class CurlBase {
    private String url;
    private String raw_url;
    private String method;
    private String headers;
    private String data;
    private String queries;
}