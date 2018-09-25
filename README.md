# Protect the Globe
## In alpha stage ...

### View project

To launch open project in your favorite Java IDE compile WAR with dependencies and deploy WAR on either Tomcat or GlassFish.

### Update project

Web files deployed are not meant for development.
If you wish to make changes in the web files follow these instructions:

Make sure your WAR is deployed.

``cd Client && npm install && npm run dev``

Which will launch a node server on :1337 connecting to a WebSocket via a proxy to localhost:8080/AtariBreakout.

Front-end was developed with Vue.js a progressive javascript framework.

Source files are available in ``/Client`` folder. Interesting files to be found in ``/Client/src/components``

### Info

Updates are sent to a client at 30 packets per second, as does the client send updates to the server at that rate.

Game chat is real time and active player list is updated once per second to reduce server load.

### DB info
We used [a free MySQL hosting platform](https://www.freemysqlhosting.net/) during our development.   <br />
**We didn't get the option to change or add users, since we didn't have those priviliges.** <br />
http://www.phpmyadmin.co/ <br />
Server: sql11.freemysqlhosting.net <br />
Name: sql11210642  <br />
Username: sql11210642  <br />
Password: fYXYkF9yaq  <br />
Port number: 3306  <br />


