const FFI = require("ffi")
const go = new FFI.Library("./golang")
go.Hi()
