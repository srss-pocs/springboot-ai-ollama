# springboot-ai-ollama
Running Spring AI - Meta's LLaMA 2 Locally with Ollama

1. Install Docker
2. Go to root directory an run command "docker compose -f docker-compose.yml up" which downloads and creates ollama container

3. ![image](https://github.com/user-attachments/assets/4d1c8030-fa59-41af-87ac-135e4040c145)

4. ![image](https://github.com/user-attachments/assets/6ded335d-972c-441a-a3e9-4b03c9e61db4)

5. Start the container "docker exec -it ollama ollama run llama2"

6. ![image](https://github.com/user-attachments/assets/978b377a-fe6e-4d15-8c3f-8ebb8466abe4)

7. Start Springboot application
8. ![image](https://github.com/user-attachments/assets/e4c69e51-6702-48a5-a5b9-4d1036f95fda)

9. Run the API "http://localhost:8080/api/v1/generate?promptMessage="Capital of India""

10. ![image](https://github.com/user-attachments/assets/8fd7581e-bc0d-474e-b141-84effbf1b551)








