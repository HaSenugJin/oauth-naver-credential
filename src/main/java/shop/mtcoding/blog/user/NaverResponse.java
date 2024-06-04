package shop.mtcoding.blog.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

public class NaverResponse {

    @Data
    public static class NaverUserDTO {
        @JsonProperty("response")
        private response response;

        @Data
        public static class response {
            private String id;
            private String email;
            private String mobile;
            private String name;
            @JsonProperty("birthyear")
            private String birthYear;
        }
    }
}
