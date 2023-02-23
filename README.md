
SeguradoratesteApplication.java - Class main execute test

OrcamentoController - Methods REST Controller:
(Content-Type = application/json)

* getTeste - http://localhost:8080/insurance/teste/{id} - testarOK (id)

* getBudgetAll(GET) - http://localhost:8080/insurance/budget/all - View All Data and make one data example.

* getBudget(GET) - http://localhost:8080/insurance/budget/{id} - get (id) data

* deleteBudget(DELETE) - http://localhost:8080/insurance/budget/{id} - remove data

* budget(POST) - http://localhost:8080/insurance/budget - insert data 

   Body example:
   
   {
    "dtCreate": "2023-02-10T13:30:27.391+00:00",
    "dtUpdate": "2023-02-10T13:30:27.391+00:00",
    "customer": {
        "name": "Beltrano da Silva",
        "driver": {
            "document": 44444444,
            "birthdate": "2023-02-10T13:30:27.391+00:00"
        }
    },
    "cars": {
        "model": "beltrano modelo",
        "manufacturer": "outro mit",
        "year": 2014,
        "valueFipe": 70000.00,
        "cardrivers": [
            {
                "driver": {
                    "document": 111555333333333,
                    "birthdate": "2023-02-10T13:30:27.391+00:00"
                },
                "mainDriver": false
            },
            {
                "driver": {
                    "document": 44444444,
                    "birthdate": "2023-02-10T13:30:27.391+00:00"
                },
                "mainDriver": true
            }
        ],
        "claims": [
            {
                "driver": {
                    "document": 44444444,
                    "birthdate": "2023-02-10T13:30:27.391+00:00"
                },
                "dtEvent": "2023-02-10T13:30:27.391+00:00"
            }
        ]
    },
    "active": true
}
   

* putBudget(PUT) - http://localhost:8080/insurance/budget - Insert or Change

   Body example:
       {
        "dtCreate": "2023-02-10T13:30:27.391+00:00",
        "dtUpdate": "2023-02-10T13:30:27.391+00:00",
        "customer": {
            "id": 2,
            "name": "Beltrano2 da Silva",
            "driver": {
                "id": 6,
                "document": 44444444,
                "birthdate": "2023-02-10T13:30:27.391+00:00"
            }
        },
        "cars": {
            "id": 2,
            "model": "beltrano modelo",
            "manufacturer": "outro mit",
            "year": 2014,
            "valueFipe": 70000.00,
            "cardrivers": [
                {
                    "id": 3,
                    "driver": {
                        "id": 3,
                        "document": 44444444,
                        "birthdate": "2023-02-10T13:30:27.391+00:00"
                    },
                    "mainDriver": true
                },
                {
                    "id": 4,
                    "driver": {
                        "id": 4,
                        "document": 111555333333333,
                        "birthdate": "2023-02-10T13:30:27.391+00:00"
                    },
                    "mainDriver": false
                }
            ],
            "claims": [
                {
                    "driver": {
                        "id": 5,
                        "document": 555555555,
                        "birthdate": "2023-02-10T13:30:27.391+00:00"
                    },
                    "dtEvent": "2023-02-10T13:30:27.391+00:00"
                }
            ]
        },
        "active": true
    }