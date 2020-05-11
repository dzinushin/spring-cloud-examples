Example of configuring Spring Cloud Gateway

Man concetps:

- Routes
- Predicates
- Filters

```shell script
docker run --rm -p 8080:80 kennethreitz/httpbin

cd nodejs-mcs && npm start 


# route to httpbin.org
echo "payload" | http POST localhost:9000/post

# route to local httpbin with rewrite
http "localhost:9000/local/get?a=b"

# route to local nodejs mcs with rewrite
echo '{"msg":"hello" }' | http POST "localhost:9000/widget-statistics/widgets/events/widget1"
# the same as
echo '{"msg":"hello" }' | "http POST localhost:3000/widgets/events/widget1"
```


https://medium.com/@niral22/spring-cloud-gateway-tutorial-5311ddd59816
