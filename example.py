from ctypes import *
go = cdll.LoadLibrary("./libgo.so")
print go.Hi(333333333)
