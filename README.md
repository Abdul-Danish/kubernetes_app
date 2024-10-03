# kubernetes_app


@@ WORKER NODES:

	- Worker Nodes: Hosts Application as Containers.

	- Kube-Proxy: If the nodes have to communicate between the worker-node of different container it is done by this component. It make sures the necessary rules are in place for the worker-node to allow containers running on them to communicate with each other.



@@ CONTROL SHIP (Master Node):

	## Contains:

		- Master Node: Manage, plan, schedule, monitor nodes.

		- Kube-Scheduler: Identifies the right node to place the container on based on the resource requirements, resource capacity, policies or constraints.

		- ETCD Cluster: Information regarding the nodes, like which container is on which ship, what time it was loaded in a key-value fashion. 

		- controller Manager: Which in turn contains "Node-Controller" and "Replication-Controller"

			* Node-Controller: Responsible for managing Nodes, like onboarding new nodes Handling situations where node becomes unavailable.

			* Replication-Controller: Make sures desired number of containers are running.

		- Kube Api Server: Responsible for orchestrating all operations within the cluster.
		

@@ CAPTION (Kubelet):
	
	- Kubelet is an agent which runs on each node and Contains information regarding the containers to be loaded on the ship, sending information to the Control-Ship regarding the status of the containers.

	- It listens for instructions from the Kube-Api Server and deploys or destroys containers on the node as required.

	- The kube-Api server periodically fetches status reports from the kubelet to monitor the status of nodes and container on them.

@@ CONTAINERS:
	
	- All the components such as Control-Ship (Master Node) Worker Nodes () are hosted in the form of containers e.g; Docker




Cluster -> Nodes -> pods -> containers


- we containerize the application and deploy it as a pod (a kubernetes object) in kubernetes 

- 




@@ Commands:

	## Pods:

		- kubectl create -f <fileName> / kubectl run <PodName> --image=<ImageName> (same for service)

		- kubectl get pods

		- kubectl describe pods / kubectl describe pod <podName>

		- kubectl delete pod <pod1> <pod2>

	## Replicasets:

		- kubectl get replicasets

		- kubectl describe replicaset / kubectl describe replicaset <ReplicasetName>

		- kubectl delete replicaset <ReplicasetName>

		- kubectl edit replicaset <ReplicasetName>

		- kubectl scale --replicas=5 replicaset <ReplicasetName>

	# Service:

		- kubectl apply -f <ServiceFilel>

		- kubectl get service -n <namespace>

		- kubectl delete service -n <namespace> <ServiceName>

	# NampSpace:

		- kubectl create namespace <namespace>


	# Nodes:

		- kubectl get nodes

		- 

Docker Commands:

	- Run "docker build -t <your_username>/my-private-repo ." to build your Docker image.

	- Run "docker image tag  <your_username>/my-private-repo <your_username>/my-private-repo:<tag>" to tag docker image (optional: default tag is latest)

	- Run "docker run <your_username>/my-private-repo" to test your Docker image locally.

	- Run "docker push <your_username>/my-private-repo" to push your Docker image to Docker Hub.


Kubernetes Commands:

	- kubectl get svc, pods, nodes, deployments


minikube: 
	
	- minikube start

	- minikube stop

	- minikube service <service_name> --url
