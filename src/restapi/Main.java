package restapi;

public class Main {

	public static void main(String[] args) {

		System.out.println("I love coding! :)");
		// This is the video URL:
		// youtube.com/watch?v=9oq7Y8n1t00
		
		// We need to add the gson plugin:
//		<dependency>
//			<groupId>com.google.code.gson</groupId>
//			<artifactId>gson</artifactId>
//			<version>2.9.0</version>
//		</dependency>

		Transcript transcript = new Transcript();
		transcript.setAudio_url("https://github.com/johnmarty3/JavaAPITutorial/blob/main/Thirsty.mp4");
		Gson gson = new Gson();
		String jsonRequest = gson.toJson(transcript);
		
		System.out.println(jsonRequest);
		
//		HttpRequest postRequest = HttpRequest.newBuilder()
//				.uri(new URI(""))
//				.header("Authorization", Constants.API_KEY) // You can copy an API key here, but hey, BETTER NOT TO DO THAT
//				.POST(BodyPublishers.ofString("{\"audio_url\": \"https://github.com/johnmarty3/JavaAPITutorial/blob/main/Thirsty.mp4\"}"))
//			    .build();			

		HttpRequest postRequest = HttpRequest.newBuilder()
				.uti(new URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization", Constants.API_KEY)
				.POST(BodyPublishers.ofString(jsonRequest))
				.build();
		
		HttpClient httpClient = HttpClient.newHttpClient();
		
		HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
		
		System.out.println(postResponse.body());
		
		transcript = gson.fromJson(postResponse.body(), Transcript.class);

		System.out.println(transcript.getId());
		
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
				.header("Authorization", Constants.API_KEY)
//				.GET // This is not necessary because GET is a default method
				.build();
		
		while (true) {
			
			int timer = 0;
			
			HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
			transcript = gson.fromJson(getResponse.body(), Transcript.class);
			
			System.out.println(transcript.getStatus() + ", 1 seconds since start");
			
			if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
				break;
			}
			
			
			Thread.sleep(1000);
			timer++;
			
		}
		
		System.out.println("Transcription completed!");
		System.out.println(transcript.getText());
				
	}
	
}
