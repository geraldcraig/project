from spleeter.separator import Separator

# Using embedded configuration.
separator = Separator('spleeter:2stems')


audio_file = "audio_example.mp3"
folder = "output"
separator.separate_to_file(audio_file, folder)

# separator.separate(audio_file)
