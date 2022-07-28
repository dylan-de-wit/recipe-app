<script lang="ts">
    import Button from './Button.svelte'

    // todo: implement nicely
    function switchMode(): void {
        const currentTheme = document.body.getAttribute('data-theme');
        const selectedTheme = currentTheme === 'dark' ? 'light' : 'dark';
        document.body.setAttribute('data-theme', selectedTheme);
    }
</script>

<Button text="Dark mode" on:click={switchMode} />
