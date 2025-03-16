import json
import Algoritmo_encriptador

class Main:
    def __init__(self):
        palabra = input("Ingrese una palabra para encriptar: ")

        """Verificar que la palabra solo tenga letras """
        while not palabra.isalpha():
            print("Error: La palabra solo debe contener letras. Inténtelo de nuevo.")
            palabra = input("Ingrese una palabra para encriptar (solo letras): ")
        
        
        palabra = palabra.lower()  # Convertir a minúsculas
        
        self.palabra_a_encriptar = Algoritmo_encriptador.Encriptador(palabra)

        palabra_encriptada1 = self.palabra_a_encriptar.encriptacion1()
        palabra_encriptada2 = self.palabra_a_encriptar.encriptacion2(palabra_encriptada1)

        print(f"Palabra encriptada nivel 1: {palabra_encriptada1}")
        print(f"Palabra encriptada nivel 2: {palabra_encriptada2}")

if __name__ == "__main__":
    Main()