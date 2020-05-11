Example of configuring Spring Cloud Gateway

```shell script
docker run --rm -p 8081:80 kennethreitz/httpbin

# route to httpbin.org
echo "payload" | http POST localhost:8080/post

# route to local with rewrite
http "localhost:8080/local/get?a=b"

# route to local with rewrite
http "localhost:8080/widget-statistics/get"
```


https://medium.com/@niral22/spring-cloud-gateway-tutorial-5311ddd59816
