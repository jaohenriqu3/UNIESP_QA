import pytest
from email import enviar_email

def test_enviar_email_invalido():
    
    email_invalido = "email_invalido_sem_arroba"
    
    with pytest.raises(ValueError, match="E-mail inválido"):
        enviar_email(email_invalido)

def test_enviar_email_valido():

    email_valido = "teste@exemplo.com"
    
    resultado = enviar_email(email_valido)
    
    assert resultado == True  
