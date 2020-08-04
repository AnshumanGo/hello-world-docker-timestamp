### Instruction

1. Configure java, git and docker in you machine
2. Git Clone repo and run `cd hello-world-docker-timestamp`.
3. Run `javac DockerDemo.java`.
4. Run `docker image build -t hello-world-docker-timestamp-new:1.0 <path>`.
5. Run `docker container run --publish 8000:8080 --name dd hello-world-docker-timestamp-new:1.0`.
6. Run `docker container rm --force cc` terminate container.
