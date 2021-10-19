import org.openapitools.openapidiff.core.OpenApiCompare;
import org.openapitools.openapidiff.core.model.ChangedOpenApi;
import org.openapitools.openapidiff.core.output.MarkdownRender;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
        public static final String OPENAPI_DOC1 = "src/main/resources/spec/openapi1.yaml";
        public static final String OPENAPI_DOC2 = "src/main/resources/spec/openapi2.yaml";

        public static void main(String[] args) {


            ChangedOpenApi diff = OpenApiCompare.fromLocations(OPENAPI_DOC1, OPENAPI_DOC2);

            String render = new MarkdownRender().render(diff);
            try {
                FileWriter fw = new FileWriter(
                        "resultDiff.md");
                fw.write(render);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


