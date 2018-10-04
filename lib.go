package main

import "C"
import "fmt"

//export Hi
func Hi() {
	fmt.Println("Hi: 这里执行的是GO程序！")
}

func main() {}
