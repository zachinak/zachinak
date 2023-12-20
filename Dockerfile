# syntax=docker/dockerfile:1

FROM amazoncorretto
WORKDIR /app
COPY . .
RUN yarn install --production
CMD ["node", "src/index.js"]
EXPOSE 3000