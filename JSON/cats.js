var cats = { };

cats["Maine Coon"] = { };
cats["Maine Coon"].Country = "United States"
cats["Maine Coon"].Origin = "Natural"
cats["Maine Coon"].Coat = "Long"

cats["European Shorthair"] = { };
cats["European Shorthair"].Country = "Europe"
cats["European Shorthair"].Origin = "Natural"
cats["European Shorthair"].Coat = "Short"

var json = JSON.stringify(cats);

console.log(json)
