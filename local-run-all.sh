#!/usr/bin/env bash

cd components/play-realtime
./activator clean docker:stage docker:publishLocal

cd ../../devtools/cff-mock-feeder
docker-compose build
docker-compose up
