package main

import "C"
import "utilgo/serve"

func main() {}

//export Hi
func Hi() {
	w := serve.New()
	w.Add("/main", func(ctx serve.Context) error {
		return ctx.ToJson(200, true, "你好安卓")
	})
	w.Run(false, ":2000")
}
