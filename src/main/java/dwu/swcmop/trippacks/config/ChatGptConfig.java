package dwu.swcmop.trippacks.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatGptConfig {
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";

    @Value("${chatGpt.key}")
    public String API_KEY;
    public static final String MODEL = "text-davinci-003";
    public static final Integer MAX_TOKEN = 300;
    public static final Double TEMPERATURE = 0.0;
    public static final Double TOP_P = 1.0;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8";
    public static final String URL = "https://api.openai.com/v1/completions";
}