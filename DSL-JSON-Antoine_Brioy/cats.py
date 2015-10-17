import json

cats = {
	"Maine Coon": {
		"Country": "United States",
		"Origin": "Natural",
		"Coat": "Long"
	}
}

cats["European Shorthair"]={
	"Country": "Europe",
	"Origin": "Natural",
	"Coat": "Short"
}

print(json.dumps(cats))
