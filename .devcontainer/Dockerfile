# badprog.com

# Image base
FROM mcr.microsoft.com/devcontainers/java:1-21

# Run
ARG GRADLE_VERSION=8.14.3
RUN wget -q https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip \
    && unzip -d /opt/gradle gradle-${GRADLE_VERSION}-bin.zip \
    && rm gradle-${GRADLE_VERSION}-bin.zip \
    && ln -s /opt/gradle/gradle-${GRADLE_VERSION}/bin/gradle /usr/bin/gradle

# Where to work
WORKDIR /workspace

# Copy all
COPY . .

# Default command
CMD ["gradle", "build"]
