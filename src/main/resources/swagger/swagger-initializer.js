window.onload = function() {
  //<editor-fold desc="Changeable Configuration Block">
  // the following lines will be replaced by docker/configurator, when it runs in a docker-container
  window.ui = SwaggerUIBundle({
    configUrl: "http://localhost:8080/docs/swagger-config",
    dom_id: '#swagger-ui',
    deepLinking: true,
    presets: [
      SwaggerUIBundle.presets.apis,
      SwaggerUIStandalonePreset,
      SwaggerUIBundle.presets.smerteliko(),
      SmertelikoPreset
    ],
    plugins: [
      SwaggerUIBundle.plugins.DownloadUrl
    ],
    layout: "SmertelikoLayout"
  });

  //</editor-fold>
};
