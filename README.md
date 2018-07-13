1.	The deployment was performed on local VM Linux Centos 7 with Ansible v. 2.2.1.0 installed. 
First you need to make sure that the SSH keys were created for current user (root) with the appropriate permissions or use password authentication.

2.	Clone repository (for example):
```
git clone git@github.com:deepak2717/ansible-jenkins-pipeline_project.git
```

The directory contains Ansible roles for automated deploying Java, Jenkins 2.52 packets with adding Pipeline job, host file, playbook for executing and text files with examples of output.
```
# ll
total 32
-rw-r--r-- 1 root root   57 Mar 30 12:03 ansible.host
-rw-r--r-- 1 root root 6597 Mar 30 12:03 ansible_output.txt
drwxr-xr-x 8 root root   83 Mar 30 12:03 geerlingguy.java
drwxr-xr-x 9 root root   98 Mar 30 12:03 jenkins
-rw-r--r-- 1 root root 3923 Mar 30 12:03 job1_output_aborted.txt
-rw-r--r-- 1 root root 3337 Mar 30 12:03 job1_output_proceeded.txt
-rw-r--r-- 1 root root  582 Mar 30 12:03 pipeline.txt
-rw-r--r-- 1 root root   43 Mar 30 12:03 playbook.yml
-rw-r--r-- 1 root root   27 Mar 30 12:03 README.md
```
3.execute the command:
```
ansible-playbook -i ansible.host playbook.yml
```
