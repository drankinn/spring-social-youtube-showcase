package org.springframework.web.servlet.view.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 * User: lancea10
 * Date: 8/24/12
 * Time: 3:57 PM
 */
public class YoutubeMappingJacksonJsonView extends MappingJacksonJsonView{

    private ObjectMapper mapper = new ObjectMapper().configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);

    public YoutubeMappingJacksonJsonView() {
        setContentType(DEFAULT_CONTENT_TYPE);
        setExposePathVariables(false);
    }


}
