package utilities;

public class SpartanNewBase {

    public static  RequestSpecification reqSpec;
    public static ResponseSpecification responseSpec;
    public static RequestSpecification userSpec;
    public static RequestSpecification adminSpec;

    @BeforeAll
    public static void init(){
        baseURI ="http://44.201.121.105";
        port = 7000;
        basePath ="/api";

        reqSpec = given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("admin", "admin")
                .log().all();

        userSpec = given()
                .accept(ContentType.JSON)
                .and()
                .auth().basic("user", "user")
                .log().all();

        responseSpec = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .logDetail(LogDetail.ALL);
    }

    @AfterAll
    public static void close(){
        //reste the info we set above, method comes from restassured
        reset();
    }
}
