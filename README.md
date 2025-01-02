Postman collection corresponding with created REST API.

{
	"info": {
		"_postman_id": "ac212ee2-dffe-4362-b472-bc75cfed806f",
		"name": "Football manager requests",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "14789408"
	},
	"item": [
		{
			"name": "Get all players",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/players",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"players"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get player by id",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/players/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"players",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Create player",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "    {\r\n        \"name\": \"Test test\",\r\n        \"age\": 30,\r\n        \"experienceMonths\": 72,\r\n        \"team\": { \"id\": 2 }\r\n    }",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/players",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"players"
					]
				}
			},
			"response": []
		},
		{
			"name": "Update player",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "    {\r\n        \"name\": \"Test test1\",\r\n        \"age\": 30,\r\n        \"experienceMonths\": 72,\r\n        \"team\": { \"id\": 2 }\r\n    }",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/players/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"players",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Delete player",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/players/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"players",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get all teams",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/teams",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"teams"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get team by id",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/teams/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"teams",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Create team",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"name\": \"Test team\",\r\n    \"balance\": 5000000,\r\n    \"commissionRate\": 1.0\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/teams",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"teams"
					]
				}
			},
			"response": []
		},
		{
			"name": "Update team",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"id\": 6,\r\n    \"name\": \"Test team1\",\r\n    \"balance\": 5000000,\r\n    \"commissionRate\": 1.0\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/teams/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"teams",
						"1"
					]
				}
			},
			"response": []
		},
		{
			"name": "Transfer",
			"request": {
				"method": "PUT",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/teams/1/transfer/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"teams",
						"1",
						"transfer",
						"2"
					]
				}
			},
			"response": []
		}
	]
}
