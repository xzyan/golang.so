from ctypes import *  
lib = cdll.LoadLibrary("./libgo.so")
lib.Hi()
