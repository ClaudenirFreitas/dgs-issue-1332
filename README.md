# dgs-issue-1332

## Pre requisites

| Name    | Required |
|---------|----------|
| Java 17 | true     |


## running application
1. Clone this repo
```
git clone https://github.com/ClaudenirFreitas/dgs-issue-1332.git
```
2. Run the application:
```
./gradlew clean bootRun
```
3. Open the GraphiQL page:
```
http://localhost:8080/graphiql
```
4. Execute this query:
```
{
  shows {
    title
    releaseYear
  }
}
```
