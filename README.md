# scheduler
scheduler

# How to trigger email manually
```js
curl -i -H "Content-Type: application/json" -X POST \
-d '{"email":"to_emailaddress@gmail.com","subject":"Quartz Scheduler Testing","body":"Testing service","dateTime":"2019-02-27T02:48:00","timeZone":"Asia/Kolkata"}' \
http://localhost:8080/scheduleEmail
```

Note : Time should always be more than current time (Future dated)

# Screenshot

![alt text](http://i66.tinypic.com/2vm9h1l.jpg "preview1")
![alt text](http://i68.tinypic.com/avh34m.jpg "preview2")
![alt text](http://i63.tinypic.com/2sbkf0g.jpg "preview3")
![alt text](http://i67.tinypic.com/9horc1.jpg "preview4")
![alt text](http://i66.tinypic.com/18ytya.jpg "preview4")
