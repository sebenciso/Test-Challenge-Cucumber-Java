Feature No.1: Usuario puede contactar a http://aws.amazon.com/en/
Given  Form --Formulario de Contacto
When FormAs --Diligenciar campos obligatorios (*) y ()
And Click @Term -- He_leído_y_acepto_los_términos_y_condiciones (button)
But  not Click @reCapchat(button) -- bot
Then @Send(Button) diseabled -- Botón Enviar 
