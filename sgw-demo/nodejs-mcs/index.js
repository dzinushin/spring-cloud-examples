const express = require("express");
const bodyParser = require("body-parser");

const app = express();
const port = 3000;

app.use(bodyParser.json());
app.get('/', (req, res) => res.send('Hello World!'))

app.post("/widgets/events/:widget", async (req, resp) => {
    const widget = req.params.widget;
    const event = req.body;
    console.log('headers: ', req.headers);
    console.log('event: ', event);
    resp.send({widget, event});
});

app.listen(port, () => {
    console.log(`Started app, listening at port: ${port}`)
})