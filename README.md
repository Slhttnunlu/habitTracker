```
curl -X POST http://localhost:8080/habits -H "Content-Type: application/json" -d '{"name": "read english book"}'
```
-
```
curl -X POST http://localhost:8080/activities -H "Content-Type: application/json" -d '{"habitId": "1"}'
```
