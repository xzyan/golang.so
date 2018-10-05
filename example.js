const FFI = require("ffi")
const lib = new FFI.Library("./libgo",{
    "Hi":[null,[null]]
})
lib.Hi()
