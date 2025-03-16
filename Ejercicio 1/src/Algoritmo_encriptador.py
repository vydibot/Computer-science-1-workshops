import json

class Encriptador:
    def __init__(self, palabra):
        self.palabra = palabra

    def leer_caracteres_encriptacion1(self):
        with open("caracteres_encriptacion1.json", "r", encoding="utf-8") as archivo:
            caracteres = json.load(archivo)
        return caracteres

    def leer_caracteres_encriptacion2(self):
        with open("caracteres_encriptacion2.json", "r" , encoding="utf-8") as archivo:
            caracteres = json.load(archivo)
        return caracteres

    def encriptacion1(self):
        caracteres_encriptacion1 = self.leer_caracteres_encriptacion1()
        palabra_encriptada1 = ""

        for caracter in self.palabra:
            if caracter in caracteres_encriptacion1:
                palabra_encriptada1 += caracteres_encriptacion1[caracter]
            else:
                palabra_encriptada1 += caracter

        return palabra_encriptada1

    def encriptacion2(self, palabra_encriptada1):
        caracteres_encriptacion2 = self.leer_caracteres_encriptacion2()
        palabra_encriptada2 = ""

        for caracter in palabra_encriptada1:
            if caracter in caracteres_encriptacion2:
                palabra_encriptada2 += caracteres_encriptacion2[caracter]
            else:
                palabra_encriptada2 += caracter

        return palabra_encriptada2