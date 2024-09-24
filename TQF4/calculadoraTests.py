import pytest
from calculadora import Calculadora

@pytest.fixture
def calculadora():
    return Calculadora()

def test_adicao(calculadora):
    assert calculadora.adicao(2, 3) == 5
    assert calculadora.adicao(-2, -3) == -5
    assert calculadora.adicao(-2, 3) == 1

def test_subtracao(calculadora):
    assert calculadora.subtracao(5, 3) == 2
    assert calculadora.subtracao(-5, -3) == -2
    assert calculadora.subtracao(5, -3) == 8

def test_multiplicacao(calculadora):
    assert calculadora.multiplicacao(3, 4) == 12
    assert calculadora.multiplicacao(-3, 4) == -12
    assert calculadora.multiplicacao(0, 4) == 0

def test_divisao(calculadora):
    assert calculadora.divisao(10, 2) == 5
    assert calculadora.divisao(9, 2) == 4.5
    assert calculadora.divisao(-10, 2) == -5
    with pytest.raises(ValueError):
        calculadora.divisao(10, 0)

def test_fatorial(calculadora):
    assert calculadora.fatorial(5) == 120
    assert calculadora.fatorial(0) == 1
    with pytest.raises(ValueError):
        calculadora.fatorial(-5)

def test_potencia(calculadora):
    assert calculadora.potencia(2, 3) == 8
    assert calculadora.potencia(2, 0) == 1
    assert calculadora.potencia(2, -2) == 0.25