| Function | Object reference | Return value   | is extension function                       |
|----------|------------------|----------------|---------------------------------------------|
| let      | it               | Lambda result  | Yes                                         |
| run      | this             | Lambda result  | Yes                                         |
| run      |                  | Lambda result  | No: called without the context object       |
| with     | this             | Lambda result  | No: takes the context object as an argument |
| apply    | this             | Context object | Yes                                         |
| also     | it               | Context object | Yes                                         |
