Feature No.2: Usuario puede contactar a https://portal.aws.amazon.com/billing/signup?redirect_url=https%3A%2F%2Faws.amazon.com%2Fregistration-confirmation&language=es_es#/start
Given  Form --Form registerUser
When FormAs --fill out required fields  (*) y ()
And Click @Continue -- He_leído_y_acepts_términos_y_condiciones (button)
When informationContact -- Fill out required fields (*) y ()
When informtionCash-- Fill out requerid fields (*) y ()
And Click @VerificarAñadir(button) -- bot
Then @Send(Button) enabled -- Botón Enviar
