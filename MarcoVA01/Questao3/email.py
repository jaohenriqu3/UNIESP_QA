import re

def enviar_email(email):
    # Verifica se o email é válido 
    padrao_email = r"[^@]+@[^@]+\.[^@]+"
    if not re.match(padrao_email, email):
        raise ValueError(f"E-mail inválido: {email}")
    
    return True 
