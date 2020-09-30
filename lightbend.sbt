resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/ByXNGarHjhyZz5J-WvxyWq6L9l_JFLOo4AylaMhJzar7dWpl/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/ByXNGarHjhyZz5J-WvxyWq6L9l_JFLOo4AylaMhJzar7dWpl/commercial-releases"))(Resolver.ivyStylePatterns)