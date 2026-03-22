interface ApiBluePrint {
  // final static fields
  String REST_TYPE = "rest";
  String GRAPH_QL_TYPE = "graphql";

  // public abstract methods
  Object fetchData(String endpoint);

  Object saveData(String endpoint, Object payload);
}

class RestApi implements ApiBluePrint {
  public static String API_TYPE = ApiBluePrint.REST_TYPE;

  public Object fetchData(String apiEndpoint) {
    System.out.println("REST API: Fetching Data");
    return null;
  }

  public Object saveData(String apiEndpoint, Object payload) {
    System.out.println("REST API: Saving Data");
    return null;
  }
}

class GraphQlApi implements ApiBluePrint {
  public static String API_TYPE = ApiBluePrint.GRAPH_QL_TYPE;

  public Object fetchData(String query) {
    System.out.println("GraphQL API: Fetching Data");
    return null;
  }

  public Object saveData(String query, Object payload) {
    System.out.println("GraphQL API: Saving Data");
    return null;
  }
}

public class Interfaces {
  public static void main(String[] args) {
    RestApi restApi = new RestApi();
    restApi.fetchData("GET /api/users");
    restApi.saveData("POST /api/users", "{}");

    GraphQlApi graphQlApi = new GraphQlApi();
    graphQlApi.fetchData("POST /graphql { users { id name } }");
    graphQlApi.saveData("POST /graphql { user(id: 1) { name } }", null);
  }
}
