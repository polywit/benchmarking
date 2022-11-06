# This file is part of the competition environment.
#
# SPDX-FileCopyrightText: 2011-2022 Dirk Beyer <https://www.sosy-lab.org>
#
# SPDX-License-Identifier: Apache-2.0

FROM ubuntu:22.04
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y tzdata
RUN ln -fs /usr/share/zoneinfo/Europe/Berlin /etc/localtime
RUN dpkg-reconfigure --frontend noninteractive tzdata
RUN dpkg --add-architecture i386
RUN apt-get install -y \
       openjdk-8-jdk-headless \
       python3-networkx\
       python3-pip
WORKDIR /polywit/benchmarks
COPY . .
RUN pip3 install -r requirements.txt
ENV PYTHONPATH "${PYTHONPATH}:/polywit/polywit/bin:/polywit/benchmarks/benchexec_info"
