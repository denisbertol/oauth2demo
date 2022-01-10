# Oauth2 Client Credentials Demo
Projeto Java Spring Boot de exemplo de cliente outh2 utilizando o fluxo de Client Credentials

# Conteúdo
* [Motivadores](#motivadores)
* [Procedimento](#procedimento)

# <a name="motivadores"></a>Motivadores
É muito importante proteger os recursos da sua API e neste projeto podemos exemplificar como fazê-lo utilizando o protocolo de autorização Outh2.
OAuth 2 oferece específicos fluxos de autorização para aplicações web, desktop, mobile e APIs.
Neste projeto exemplificamos um Resource Server sendo acessado através de um token obtido pelo Authorization Server (Keycloak)


# <a name="procedimento"></a>Procedimento
* O Authorization Server utilizado foi o Keycloak. Baixar o Keycloak aqui: https://github.com/keycloak/keycloak/releases/download/16.1.0/keycloak-16.1.0.zip
* Descompactar o pacote e executar dentro do diretorio /bin/standalone.bat -Djboss.http.port=8180
* Importar as configurações disponbilizadas em: config/realm-export.json
* Executar a aplicação java
* Para facilitar o teste, importar a collection no postman para executar as chamadas: config/Oauth2Demo.postman_collection.json
* Executar a collection "List Agentes". Obs: Confira nos Pre-Scripts da Request os vaores de client-id e client-secret ;)