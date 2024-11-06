/// <reference types="cypress" />

context('Testes de Login', () => { 

    it('Login válido', () => {
        cy.visit('https://www.saucedemo.com/') 
        cy.clearAllCookies({log: true})
        // Informar Login  
        cy.get('[data-test="username"]').type('standard_user')
        
        // Informar senha
        cy.get('[data-test="password"]').type('secret_sauce')

        // Clicar no botão -> Login 
        cy.click('data-test="login-button')

        // Verificar resultado
    });
    
});


