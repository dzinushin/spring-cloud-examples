Example of configuring Spring Cloud Gateway

Man concetps:

- Routes
- Predicates
- Filters

```shell script
docker run --rm -p 8080:80 kennethreitz/httpbin

# route to httpbin.org
echo "payload" | http POST localhost:9000/post

# route to local with rewrite
http "localhost:9000/local/get?a=b"

# route to local with rewrite
http "localhost:9000/widget-statistics/get"
```


https://medium.com/@niral22/spring-cloud-gateway-tutorial-5311ddd59816
