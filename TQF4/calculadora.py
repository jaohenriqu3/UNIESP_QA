class Calculadora:
    def adicao(self, a, b):
        return a + b

    def subtracao(self, a, b):
        return a - b

    def multiplicacao(self, a, b):
        return a * b

    def divisao(self, a, b):
        if b == 0:
            raise ValueError("Divisão por zero não é permitida")
        return a / b

    def fatorial(self, n):
        if n < 0:
            raise ValueError("Fatorial não pode ser calculado para números negativos")
        return 1 if n == 0 else n * self.fatorial(n - 1)

    def potencia(self, base, expoente):
        return base ** expoente
